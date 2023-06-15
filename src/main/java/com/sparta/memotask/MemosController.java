package com.sparta.memotask;

import com.sparta.memotask.basic.Memos;
import com.sparta.memotask.basic.MemosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/memos")
public class MemosController {

    private MemosRepository memosRepository = new MemosRepository();


    // 데이터 전송
    @PostMapping
    public List save(@RequestBody Memos memos) {
        Memos memos1 = new Memos(memos.getTitle(), memos.getName(), memos.getContent(), memos.getPassword());
        memosRepository.save(memos1);
        List memoList = memosRepository.findAll();
        return memoList;
    }

    // 전체 조회
    @GetMapping
    public List findAll() {
        List memoList = memosRepository.findAll();
        return memoList;
    }

    // 특정 값 전송 후 조회
    @GetMapping("/{userId}")
    public Memos findById(@PathVariable long userId) {
        Memos memos = memosRepository.findById(userId);
        return memos;
    }

    // 수정
    @PatchMapping("/{userId}")
    public Memos updateUser(@PathVariable long userId, @RequestBody Memos memosUpdate) {
        Memos memos = memosRepository.findById(userId);
        if(memosUpdate.getPassword().equals(memos.getPassword())) {
            memos.setTitle(memosUpdate.getTitle());
            memos.setName(memosUpdate.getName());
            memos.setContent(memosUpdate.getContent());
            Date creationTime = new Date();
            memos.setDate(creationTime);
        } else {}

        return memos;
    }

    // 삭제
    @DeleteMapping("/{userId}")
    public Memos deleteUser(@PathVariable long userId, @RequestBody Memos memosDelete) {
        Memos memos = memosRepository.findById(userId);
        if(memosDelete.getPassword().equals(memos.getPassword())) {
            memosRepository.delete(userId);
            return null;
        } else {

        }
        return memos;
    }
}
