package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.AdminMapper;
import cn.jbit.guide_sys.pojo.Admin;
import cn.jbit.guide_sys.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper mapper;

    @Override
    public Integer loadByUsername(String a_name,String pass) {
        return mapper.loadByUsername(a_name, pass);
    }
}
