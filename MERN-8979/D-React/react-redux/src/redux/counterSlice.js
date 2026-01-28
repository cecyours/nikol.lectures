import { createSlice } from "@reduxjs/toolkit";

const counterSlice = createSlice({
    initialState: {
        counter: 0
    },
    name: "Counter",
    reducers: {
        increment: (state) => {

            state.counter++
        },
        decrement: (state) => {
            state.counter--
        },

    }
})


export const { decrement, increment } = counterSlice.actions
export default counterSlice.reducer