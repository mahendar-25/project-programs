import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ProductListComponent } from './products/product-list.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConvertToSpacesPipe } from 'src/app/products/convert-to-spaces.pipe';



@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ConvertToSpacesPipe
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
