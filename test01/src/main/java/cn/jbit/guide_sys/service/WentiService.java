package cn.jbit.guide_sys.service;

import cn.jbit.guide_sys.pojo.Wenti;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WentiService {
    //查询问题
    List<Wenti> selWenti();
    //添加问题
    int addWenti(Wenti wenti);
    //增加人数
    int count(@Param("id") int id);
}
