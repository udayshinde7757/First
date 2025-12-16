#include<iostream>
using namespace std;
class Distance{
int feet,inch;
public:
Distance(int f,int i){
feet=f;
inch=i;
}
Distance(){
    feet=0;
    inch=0;
}
void showd(){
    cout << feet << " " << inch << endl;
}
friend Distance sum(Distance &d,Distance &p);
};
Distance sum(Distance &d,Distance &p){
Distance d1;
d1.feet=d.feet+p.feet;
d1.inch=d.inch+p.inch;
if (d1.inch >= 12) {
        d1.feet += d1.inch / 12;
        d1.inch = d1.inch % 12;
    }
    return d1;
}
int main() {
    Distance s1(10,5),s2(20,10);
    s1.showd();
    s2.showd();
    Distance s3=sum(s1,s2);
    s3.showd();
    return 0;
}