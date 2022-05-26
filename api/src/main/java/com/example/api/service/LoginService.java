package com.example.api.service;

import com.example.api.domain.MMember;
import com.example.api.domain.MMemberExample;
import com.example.api.form.UserForm;
import com.example.api.mapper.MMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoginService {

    @Autowired
    com.example.api.mapper.MMemberMapper mMemberMapper;

    public boolean certificateUser(UserForm userForm) {
        MMemberExample example=new MMemberExample();
        example.createCriteria().andAddressNameEqualTo(userForm.getUserId()).andPassWordEqualTo(userForm.getPassword()).andDeleteFlagEqualTo(false);
        List<MMember> members= mMemberMapper.selectByExample(example);
        return Objects.isNull(members);
    }


}
