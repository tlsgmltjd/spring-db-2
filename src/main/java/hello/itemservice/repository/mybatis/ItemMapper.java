package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

// MyBatis 매핑 XML을 호출해주는 매퍼 인터페이스이다.

@Mapper
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto itemUpdateDto);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);

}
