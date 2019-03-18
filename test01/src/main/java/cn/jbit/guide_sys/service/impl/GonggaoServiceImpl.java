package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.GonggaoMapper;
import cn.jbit.guide_sys.pojo.Gonggao;
import cn.jbit.guide_sys.service.GonggaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GonggaoServiceImpl implements GonggaoService {

    @Autowired
    private GonggaoMapper gonggaoMapper;
    @Override
    public List<Gonggao> selGonggao() {
        return gonggaoMapper.selGonggao();
    }

    @Override
    public int delGonggao(int id) {
        return gonggaoMapper.delGonggao(id);
    }

    @Override
    public int addGonggao(Gonggao gonggao) {
        return gonggaoMapper.addGonggao(gonggao);
    }

    @Override
    public int updGonggao(Gonggao gonggao) {
        return gonggaoMapper.updGonggao(gonggao);
    }
}
