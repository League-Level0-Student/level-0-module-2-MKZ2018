int x = 0;
void setup(){
  size(800,200);
}

void draw() {
  background(255);
fill(#FFFFFF);
  if (mousePressed) {
x += 100;
  }
  ellipse(x,100,100,100);
if(x == 800){
print("ding");
}
  
}

