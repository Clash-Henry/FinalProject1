package com.wtu.service;

import com.wtu.entity.Moment;
import com.wtu.mapper.MomentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MomentServiceImpl implements MomentService {
    @Autowired
    private MomentMapper momentMapper;
    @Override
    public List<Moment> allMoments() {
        return momentMapper.allMoments();
    }

    @Override
    public void insertMoment(Moment moment) {
        momentMapper.insertMoment(moment);
    }

    @Override
    public void loveMoment(int id) {
        momentMapper.loveMoment(id);
    }

    @Override
    public List<Moment> researchMoment(String research) {
        return momentMapper.researchMoment(research);
    }

    @Override
    public void deleteMoment(int mid) {
        momentMapper.deleteMoment(mid);
    }
}
