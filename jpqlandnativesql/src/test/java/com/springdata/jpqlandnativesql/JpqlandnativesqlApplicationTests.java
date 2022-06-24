package com.springdata.jpqlandnativesql;

import com.springdata.jpqlandnativesql.entities.Student;
import com.springdata.jpqlandnativesql.repos.StudentRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpqlandnativesqlApplicationTests {

    @Autowired
    StudentRepo Repository;
    @Test
    public void testStudentCreate() {
        Student student = new Student();
        student.setFirstName("Sunio");
        student.setLastName("Tyagi");
        student.setScore(90);
        Repository.save(student);
        Student student2 = new Student();
        student2.setFirstName("Shezuka");
        student2.setLastName("Tyagi");
        student2.setScore(30);
        Repository.save(student2);
    }

    @Test
    public void findAllStudents(){
        System.out.println(Repository.findAllStudents(PageRequest.of(0,2, Sort.by("id"))));
    }


    @Test
    public void findAllStudentsPartialData(){
        List<Object []> partialData = Repository.findAllStudentsPartialData();
        for (Object[] objects: partialData){
            System.out.println(objects[0]);
            System.out.println(objects[1]);
        }
    }

    @Test
    public void findALlStudentsByFirstName(){
        System.out.println(Repository.findAllStudentsByFirstName("Nobita"));
    }

    @Test
    public void findAllStudentsByScore(){
        System.out.println(Repository.findAllStudentsForGivenScores(70, 91));
    }


    @Test
    @Transactional
    @Rollback(false)
    public void deleteByFirstName(){
        Repository.deleteStudentsByFirstName("Nobita");
    }

    @Test
    public void findAllStudentsByNq(){
        System.out.println(Repository.findAllStudentsNQ());
    }
}
