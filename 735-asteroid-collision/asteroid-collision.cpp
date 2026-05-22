class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        int n = asteroids.size();
        vector<int> result;

        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                result.push_back(asteroids[i]);
            } else {
                while (!result.empty() && result.back() > 0 && result.back() < -asteroids[i]) {
                    result.pop_back();
                }

                if (result.empty() && asteroids[i] < 0 || result.back() < 0) {
                    result.push_back(asteroids[i]);
                } else if (result.back() == -asteroids[i]) {
                    result.pop_back();
                }
            }
        }

        return result;
    }
};