import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { FloModule } from '@spring-project/spring-flo';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, FloModule],
  bootstrap: [AppComponent]
})
export class AppModule {}