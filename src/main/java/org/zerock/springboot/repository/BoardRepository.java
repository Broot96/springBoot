package org.zerock.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.springboot.domain.Board;
import org.zerock.springboot.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long> , BoardSearch {


}
