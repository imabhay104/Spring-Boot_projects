package com.project.ScheduleMaker.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SchedulerRpository extends JpaRepository<Schedule, Integer> {

}
