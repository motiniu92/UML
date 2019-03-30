package com.coderbd.img;

import java.io.File;
import java.util.List;

public interface StudentDao {

    void save(Student student, File file);

    List<Student> getList();
}
