package bolangit.test.api.apiimpl;

import bolangit.test.Dao.StudentDao;
import bolangit.test.api.StudentApi;
import bolangit.test.model.StudentModel;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AutoJsonRpcServiceImpl
public class StudentApiImpl implements StudentApi {

    @Autowired
    StudentDao studentDao;
    @Override
    public void save(StudentModel student) {
        studentDao.save(student);
    }

    @Override
    public void update(StudentModel student) {
        studentDao.save(student);
    }

    @Override
    public void delete(int id) {
        studentDao.deleteById(id+"");
    }

    @Override
    public List<StudentModel> query() {
        return studentDao.findAll();
    }
}
