package com.weibo.api.motan.demo.api.suggest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class ContentWrapper implements Serializable {

    private List<Content> list;
}
