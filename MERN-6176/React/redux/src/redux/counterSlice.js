import { createSlice } from "@reduxjs/toolkit";

const counterSlice = createSlice({
    name: "Counter",
    initialState: { counter: 0 },
    reducers: {
        increment: (state) => {
            state.counter += 1
        },
        decrement: (state) => {
            state.counter -= 1
        }
    }
})

export const { increment, decrement } = counterSlice.actions

export default counterSlice.reducer
