package repository;

import model.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BuyRepository extends MongoRepository<Purchase, String> {

    @Override
    List<Purchase> findAllById(Iterable<String> strings);
}