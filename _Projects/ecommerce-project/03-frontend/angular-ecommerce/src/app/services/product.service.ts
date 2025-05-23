import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Product } from '../common/product';
import { ProductCategory } from '../common/product-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
// Spring data rest only returns the first 20 objects, we can change this by using ?size=100 at the end of the url
private baseUrl = "http://localhost:8080/api/products";

private categoryUrl = 'http://localhost:8080/api/product-category';
  constructor(private httpClient: HttpClient) { }

  getProductList(theCategoryId: number): Observable<Product[]>{

  // need to build URL based on category id ... will come back to this later.
  const searchUrl = `${this.baseUrl}/search/findByCategoryId?id=${theCategoryId}`


  return this.httpClient.get<GetResponseProducts>(searchUrl).pipe(
    map(response => response._embedded.products)
  );
  }

  getProductCategories(): Observable<ProductCategory[]> {
    return this.httpClient.get<GetResponseProductCategory>(this.categoryUrl).pipe(
      map(response => response._embedded.productCategory)
    );
  }

}

interface GetResponseProducts{
  _embedded: {
    products: Product[];
  }
}

interface GetResponseProductCategory{
  _embedded: {
  productCategory: ProductCategory[];
  }
}