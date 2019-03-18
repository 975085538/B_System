package cn.jbit.guide_sys.service.impl;

import cn.jbit.guide_sys.mapper.LiuyanMapper;
import cn.jbit.guide_sys.pojo.Liuyan;
import cn.jbit.guide_sys.service.LiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiuyanServiceImpl implements LiuyanService {

    @Autowired
    private LiuyanMapper liuyanMapper;

    @Override
    public int addLiuyanT(Liuyan liuyan) {
        return liuyanMapper.addLiuyanT(liuyan);
    }

    @Override
    public List<Liuyan> selLiuyan(int id) {
        return liuyanMapper.selLiuyan(id);
    }

    @Override
    public int addhuifu(Liuyan liuyan) {
        return liuyanMapper.addhuifu(liuyan);
    }


}
