package bolangit.test.api;

import bolangit.test.model.StudentModel;
import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.List;

@JsonRpcService("/bolang")
public interface StudentApi {
    void save(@JsonRpcParam(value = "student") StudentModel student);
    void update(@JsonRpcParam(value = "student") StudentModel student);
    void delete(@JsonRpcParam(value = "id") int id);
    List<StudentModel> query();
}
