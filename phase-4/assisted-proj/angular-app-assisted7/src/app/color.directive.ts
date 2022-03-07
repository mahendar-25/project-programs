import { Directive } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  
  constructor(elem: ElementRef, renderer: Renderer2) {
    renderer.setStyle(elem.nativeElement, 'color', 'olive');
  }


}
