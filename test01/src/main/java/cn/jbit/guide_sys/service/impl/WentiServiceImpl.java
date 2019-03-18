package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.WentiMapper;
import cn.jbit.guide_sys.pojo.Wenti;
import cn.jbit.guide_sys.service.WentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WentiServiceImpl implements WentiService {

    @Autowired
    private WentiMapper wentiMapper;

    @Override
    public List<Wenti> selWenti() {
        return wentiMapper.selWenti();
    }

    @Override
    public int addWenti(Wenti wenti) {
        return wentiMapper.addWenti(wenti);
    }

    @Override
    public int count(int id) {
        return wentiMapper.count(id);
    }
}
