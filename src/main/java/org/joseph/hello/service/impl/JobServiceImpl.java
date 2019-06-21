package org.joseph.hello.service.impl;

import org.joseph.hello.entity.Job;
import org.joseph.hello.mapper.JobMapper;
import org.joseph.hello.service.IJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Joseph
 * @since 2019-06-21
 */
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements IJobService {

}
