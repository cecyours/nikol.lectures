"use client";
import { useEffect, useState } from "react";

export default function TypingPlayground() {
  const [pressedKey, setPressedKey] = useState("");
  const [position, setPosition] = useState({ x: 150, y: 150 });
  const [bgColor, setBgColor] = useState("#f1f1f1");

  useEffect(() => {
    function handleKeyDown(e) {
      setPressedKey(e.key);

      setBgColor(`#${Math.floor(Math.random() * 16777215).toString(16)}`);

      const speed = 20;
      if (e.key === "ArrowUp") {
        setPosition((prev) => ({ ...prev, y: prev.y - speed }));
      }
      if (e.key === "ArrowDown") {
        setPosition((prev) => ({ ...prev, y: prev.y + speed }));
      }
      if (e.key === "ArrowLeft") {
        setPosition((prev) => ({ ...prev, x: prev.x - speed }));
      }
      if (e.key === "ArrowRight") {
        setPosition((prev) => ({ ...prev, x: prev.x + speed }));
      }
    }

    window.addEventListener("keydown", handleKeyDown);

    return () => window.removeEventListener("keydown", handleKeyDown);
  }, []);

  return (
    <div
      style={{
        background: bgColor,
        transition: "0.2s",
      }}
      className="flex flex-col items-center justify-center"
    >
      <h1 className="text-3xl font-bold mb-4">Typing Playground</h1>
      <p className="text-xl mb-6">
        Press any key on your keyboard! (Try Arrow Keys 👆👇👉👈)
      </p>

      <div className="text-5xl font-bold p-4 bg-white rounded-xl shadow">
        {pressedKey ? `Key: ${pressedKey}` : "Press any key..."}
      </div>

      {/* Movable Box */}
      <div
        style={{
          position: "absolute",
          top: position.y,
          backgroundColor: "red",
          left: position.x,
          transition: "top 0.1s, left 0.1s",
        }}
        className="w-16 h-16 bg-blue-600 rounded-lg shadow-lg"
      ></div>
    </div>
  );
}
