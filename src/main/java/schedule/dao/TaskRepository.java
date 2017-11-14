package schedule.dao;

import org.springframework.data.repository.CrudRepository;

import schedule.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
