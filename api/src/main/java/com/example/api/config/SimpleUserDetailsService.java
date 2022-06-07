package com.example.api.config;


import com.example.api.domain.MMember;
import com.example.api.domain.MMemberExample;
import com.example.api.mapper.MMemberMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Userエンティティ
 */
@Service("simpleUserDetailsService")
public class SimpleUserDetailsService implements UserDetailsService {

    private final MMemberMapper userRepository;

    public SimpleUserDetailsService(MMemberMapper userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(final String email) {
        // emailでデータベースからユーザーエンティティを検索する
        MMemberExample example = new MMemberExample();
        example.createCriteria().andInitEmailEqualTo(email);
        List<MMember> members = userRepository.selectByExample(example);
        if (members.size() == 0) {
            throw new UsernameNotFoundException("user not found");
        } else {
          return new SimpleLoginUser(members.get(0));
        }
    }

}
