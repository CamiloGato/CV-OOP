#include <iostream>
#include <vector>

using namespace std;

int main(){

    int num;
    int sum = 0;
    vector<int> listNum;

    while (true) {

        cin >> num;
        if (num == 0){
            break;
        }
        listNum.insert(listNum.end(), num);

    }

    for (int element : listNum){
        int require = 1995 - element;
        sum += (int) count(listNum.begin(), listNum.end(), require);
    }

    cout << (int) (sum / 2);

}