package com.southwind.repository;

import com.southwind.entity.Admin;

public interface AdminRepository {
    // 测试用途
    public Admin login(String username, String password);
}
