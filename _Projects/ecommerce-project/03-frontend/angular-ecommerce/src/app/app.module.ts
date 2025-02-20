import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { provideHttpClient } from '@angular/common/http'
import { ProductService } from './services/product.service';
import { RouterModule, Routes } from '@angular/router';

// defining routes with an array of route items
const routes: Routes =[
  // The order of the routes are important, first match wins top down. Start most specific to most generic.
  {path: 'category/:id', component: ProductListComponent},
  {path: 'category', component: ProductListComponent},
  {path: 'products', component: ProductListComponent},
  {path: '', redirectTo: '/products', pathMatch: 'full'},// this path redirects the user to the products page if no path is entered
  {path: '**', redirectTo: '/products', pathMatch: 'full'}// this path will match on anything that didn't match the above routes
];

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent
  ],
  imports: [
    RouterModule.forRoot(routes),// this points to the const routes
    BrowserModule,
    AppRoutingModule // AppRoutingModule replaced HttpClientModel
  ],
  providers: [provideHttpClient(), ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
