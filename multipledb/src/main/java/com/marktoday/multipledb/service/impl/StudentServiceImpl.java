package com.marktoday.multipledb.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.marktoday.multipledb.entity.Student;
import com.marktoday.multipledb.mapper.StudentMapper;
import com.marktoday.multipledb.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {
}
