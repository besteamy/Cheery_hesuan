package workspace.service;

import org.springframework.transaction.annotation.Transactional;
import workspace.domain.User;

import java.util.List;

@Transactional
public interface UserService {

    public boolean save(User user);

    public boolean updatepwd(String password);

    public boolean update(User user);

    public boolean deleteBytel(Integer tel);

    public User getBytel(String tel);

    public List<User> getAll();



}
