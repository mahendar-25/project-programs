import { ColorDirective } from './color.directive';


@NgModule({
  imports: [
      SharedModule,
      AppRoutingModule
  ],
  declarations: [
      ChangeColorDirective,
      ProductComponent,
      MyUpperPipe,
      DiscountPipe,
      ProductSearch,
      ProductDetailComponent
  ],

describe('ColorDirective', () => {
  it('should create an instance', () => {
    const directive = new ColorDirective();
    expect(directive).toBeTruthy();
  });
});
