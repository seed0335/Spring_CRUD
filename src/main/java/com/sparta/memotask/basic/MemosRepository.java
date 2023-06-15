package com.sparta.memotask.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemosRepository {
    private static Map<Long, Memos> store = new HashMap<>();

    private static long sequence = 0L;

    public Memos save(Memos memos) {
        memos.setId(++sequence);
        store.put(memos.getId(), memos);
        return memos;
    }

    public Memos findById(Long id) {
        return store.get(id);
    }

    public List<Memos> findAll() {
        return new ArrayList<>(store.values());
    }

    public void delete(Long id) {
        store.remove(id);
    }
}
