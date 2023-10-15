package com.github.youssfbr.dio.domain.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "tb_news")
@EqualsAndHashCode(callSuper=false)
public class News extends BaseItem {

}
