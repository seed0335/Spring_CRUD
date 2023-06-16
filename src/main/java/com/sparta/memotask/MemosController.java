package com.sparta.memotask;

import com.sparta.memotask.basic.Memo;
import com.sparta.memotask.basic.MemosRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/memos")
public class MemosController {

    private MemosRepository memosRepository = new MemosRepository();


    // 게시글 작성
    @PostMapping
    public List<Memo> writeMemo(@RequestBody Memo memo) {
        memosRepository.write(new Memo(memo.getTitle(), memo.getName(), memo.getContent(), memo.getPassword()));
        List<Memo> memoList = memosRepository.findAll();
        return memoList;
    }

    // 전체 조회
    @GetMapping
    public List<Memo> findAllMemo() {
        List<Memo> memoList = memosRepository.findAll();
        return memoList;
    }

    // id 번호 게시글 선택 후 조회
    @GetMapping("/{userId}")
    public Memo findId(@PathVariable long userId) {
        Memo memo = memosRepository.findById(userId);
        return memo;
    }

    // 수정
    @PatchMapping("/{userId}")
    public Object updateMemo(@PathVariable long userId, @RequestBody Memo memoUpdate) {
        Memo memo = memosRepository.findById(userId);
        if(memoUpdate.getPassword().equals(memo.getPassword())) {
            memo.setTitle(memoUpdate.getTitle());
            memo.setName(memoUpdate.getName());
            memo.setContent(memoUpdate.getContent());

            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
            String date = sdf.format(now);
            memo.setCreationTime(date);
        } else {
            return "fail";
        }

        return memo;
    }

    // 삭제
    @DeleteMapping("/{userId}")
    public String deleteMemo(@PathVariable long userId, @RequestBody Memo memoDelete) {
        Memo memo = memosRepository.findById(userId);
        if(memoDelete.getPassword().equals(memo.getPassword())) {
            memosRepository.delete(userId);
            return "Success";
        } else {
            return "비밀번호가 틀립니다.";
        }
    }
}
