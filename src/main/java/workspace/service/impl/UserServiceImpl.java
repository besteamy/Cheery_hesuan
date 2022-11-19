package workspace.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workspace.dao.UserDao;
import workspace.domain.User;
import workspace.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean save(User user) {
        return userDao.save(user)>0;
    }

    public boolean updatepwd(String password) {
        return userDao.updatepwd(password)>0;
    }

    public boolean update(User user) {
        return userDao.update(user)>0;
    }

    public boolean deleteBytel(Integer tel) {
        return userDao.deleteBytel(tel)>0;
    }

    public User getBytel(String tel) {
        return userDao.getBytel(tel);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
