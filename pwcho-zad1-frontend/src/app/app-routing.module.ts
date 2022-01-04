import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {HomeComponent} from "./_components/home/home.component";
import {FibcalcComponent} from "./_components/fibcalc/fibcalc.component";
import {DocumentationComponent} from "./_components/documentation/documentation.component";


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'fibcalc', component: FibcalcComponent },
  { path: 'documentation', component: DocumentationComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
