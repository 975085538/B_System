package cn.jbit.guide_sys.mapper;

import cn.jbit.guide_sys.pojo.Gonggao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GonggaoMapper {
    //查询公告
    List<Gonggao> selGonggao();
    //删除公告
    int delGonggao(@Param("id") int id);
    //添加公告
    int addGonggao(Gonggao gonggao);
    //修改公告
    int updGonggao(Gonggao gonggao);
}
