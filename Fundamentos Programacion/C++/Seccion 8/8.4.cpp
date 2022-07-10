#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

int main(){
    int x;
    cin >> x;
    vector<float> nums;

    for (int i = 0; i < x; i++) {
        float num;
        cin >> num;
        nums.insert(nums.end(),num);
    }

    int counter = 0;
    for (int i = 1; i < x; i++) {
        if ( accumulate( nums.begin(), nums.begin() + i,decltype(nums)::value_type(0)) == accumulate(nums.begin() + i, nums.end(),decltype(nums)::value_type(0)) ){
            counter++;
        }
    }
    cout << counter;
}