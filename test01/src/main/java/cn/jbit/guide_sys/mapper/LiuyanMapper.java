package cn.jbit.guide_sys.mapper;

import cn.jbit.guide_sys.pojo.Liuyan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LiuyanMapper {
    //给老师留言
    int addLiuyanT(Liuyan liuyan);
    //查询留言信息
    List<Liuyan> selLiuyan(@Param("id") int id);
    //回复
    int addhuifu(Liuyan liuyan);
}
