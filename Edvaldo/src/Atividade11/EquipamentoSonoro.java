package Atividade11;

public class EquipamentoSonoro extends Equipamento {
		private short volume;
		private boolean stereo;
		
		public short getVolume() {
			return volume;
		}
		
		public void setVolume(short volume) {
			this.volume = volume;
		}
		
		public boolean getStereo() {
			return stereo;
		}
		
		public void setStereo(boolean stereo) {
			this.stereo = stereo;
		}
		
		public boolean mono() {
			this.stereo = false;
			return this.stereo;
		}
		
		public boolean stereo() {
			this.stereo = true;
			return this.stereo;
		}
		
		@Override
		public boolean ligar() {
			this.volume = 5;
			return true;
		}
		
}
