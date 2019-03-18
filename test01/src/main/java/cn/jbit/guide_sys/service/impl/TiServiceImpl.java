package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.TiMapper;
import cn.jbit.guide_sys.pojo.Ti;
import cn.jbit.guide_sys.service.TiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiServiceImpl implements TiService {
    @Autowired
    private TiMapper tiMapper;


    @Override
    public List<Ti> selTi() {
        return tiMapper.selTi();
    }
}
