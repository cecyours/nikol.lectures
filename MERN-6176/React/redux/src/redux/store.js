import { configureStore } from '@reduxjs/toolkit'
import counterSlicer from './counterSlice'
const store = configureStore({
    reducer: {
        Counter: counterSlicer
    }
})

export default store