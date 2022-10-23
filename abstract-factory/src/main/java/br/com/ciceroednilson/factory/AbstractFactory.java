package br.com.ciceroednilson.factory;

import br.com.ciceroednilson.enumeration.ProductType;

public interface AbstractFactory<T> {

    T create(ProductType productType);
}
