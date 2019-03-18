package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.JishuMapper;
import cn.jbit.guide_sys.pojo.Jishu;
import cn.jbit.guide_sys.service.JishuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JishuServiceImpl implements JishuService {

    @Autowired
    private JishuMapper jishuMapper;

    @Override
    public List<Jishu> selJishu(int id) {
        return jishuMapper.selJishu(id);
    }

    @Override
    public int addJishu(Jishu jishu) {
        return jishuMapper.addJishu(jishu);
    }

    @Override
    public List<Jishu> selmohu(String name) {
        return jishuMapper.selmohu(name);
    }
}
