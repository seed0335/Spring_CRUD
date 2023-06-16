package com.sparta.memotask.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemosRepository {
    private static Map<Long, Memo> memoMap = new HashMap<>();

    private static Long sequence = 0L;

    public Memo write(Memo memo) {
        memo.setId(++sequence);
        memoMap.put(memo.getId(), memo);
        return memo;
    }

    public Memo findById(Long id) {
        return memoMap.get(id);
    }

    public List<Memo> findAll() {
        return new ArrayList<>(memoMap.values());
    }

    public void delete(Long id) {
        memoMap.remove(id);
    }
}
