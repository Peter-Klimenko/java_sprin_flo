import { Component, ViewChild } from '@angular/core';
import { FloCanvasComponent } from '@spring-project/spring-flo';
import axios from 'axios';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  @ViewChild('canvas') canvas!: FloCanvasComponent;

  async save() {
    const dsl = this.canvas.getFlo().getGraph().toDSL();
    const name = prompt("Введите имя потока:", "myFlow");
    await axios.post('http://localhost:8080/api/flows', {
      name: name,
      dsl: dsl
    });
    alert("Сохранено!");
  }

  async load() {
    const res = await axios.get('http://localhost:8080/api/flows');
    const flows = res.data;
    const selected = flows[0];
    if (selected) {
      this.canvas.getFlo().getGraph().fromDSL(selected.dsl);
    }
  }
}