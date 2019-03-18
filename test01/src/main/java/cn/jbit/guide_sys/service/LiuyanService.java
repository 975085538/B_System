package cn.jbit.guide_sys.service;

import cn.jbit.guide_sys.pojo.Liuyan;

import java.util.List;

public interface LiuyanService {
    //给老师留言
    int addLiuyanT(Liuyan liuyan);
    //查询留言信息
    List<Liuyan> selLiuyan(int id);
    //回复
    int addhuifu(Liuyan liuyan);
}
