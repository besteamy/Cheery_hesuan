package workspace.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import workspace.domain.User;

import java.util.List;

public interface UserDao {

    @Insert("insert into user Values(#{tel},#{password},#{username},#{id_card},#{permission},1)")
    public int save(User user);

    @Update("update user set password=#{password}")
    public int updatepwd(String password);

    @Update("update user set username=#{username},id_card=#{id_card} ")
    public int update(User user);

    @Update("update user set status=0 where tel=#{tel}")
    public int deleteBytel(Integer tel);

    @Select("select * from user where tel=#{tel}")
    public User getBytel(String tel);

    @Select("select * from user")
    public List<User> getAll();



}
