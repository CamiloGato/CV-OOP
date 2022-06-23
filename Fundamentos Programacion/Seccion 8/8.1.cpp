#include <iostream>

using namespace std;

int main(){
    while(true){
        int num;
        cin >> num;
        if (num == 0){
            break;
        }

        int aux = 0;

        for (int f = 0; f < num; ++f) {
            for (int c = 0; c < num; ++c) {

                if (c == aux || c == num - aux - 1){
                    cout << "#";
                }
                else {
                    cout << "0";
                }
            }
            cout << endl;
            aux++;
        }
        cout << endl;
    }
}
