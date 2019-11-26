package com.lin.gmall.service;

import com.lin.gmall.bean.UmsMember;
import com.lin.gmall.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
