import mongoose from 'mongoose'

const userSchema = new mongoose.Schema({
    firstName: {
        type: String,
        required: true
    },
    lastName: {
        type: String,
        required: true
    },
    email: {
        type: String,
    },
    password: {
        type: String,
        required: true
    },
    phoneNumber: {
        type: Number
    },
    isActive: {
        type: Boolean
    }
})



const User = mongoose.model("user", userSchema)

export default User